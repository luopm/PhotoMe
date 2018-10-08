package com.luopm.photome.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luopm.photome.dao.*;
import com.luopm.photome.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service("userDetailService")
public class UserDetailService {

    @Autowired
    private UserDetailMapper userDetailMapper;
    @Autowired
    private UserPhotoMapper userPhotoMapper;
    @Autowired
    private UserMusicMapper userMusicMapper;
    @Autowired
    private UserCommentMapper userCommentMapper;
    @Autowired
    private UserNameToMusicCodeMapper userNameToMusicCodeMapper;
    @Autowired
    private UserNameToPhotoCodeMapper userNameToPhotoCodeMapper;
    @Autowired
    private UserPhotoService userPhotoService;
    @Autowired
    private UserNameToMusicCodeService userNameToMusicCodeService;
    @Autowired
    private UserNameToPhotoCodeService userNameToPhotoCodeService;

    public ResponseUtil addUserDetail(UserDetail userDetail){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userDetailMapper.insert(userDetail) >= 1){
//                UserNameToPhotoCode userNameToPhotoCode  = new UserNameToPhotoCode();//注册NameToPhoto
//                userNameToPhotoCode.setUsername(userDetail.getPhotomeUserdetailUsername());
//                userNameToPhotoCode.setPhotocode(userDetail.getPhotomeUserdetailUsercovercode());
//                responseUtil.setResponseUtil(1, "新增用户详情成功",
//                        userDetail,userNameToPhotoCodeService.addUTC(userNameToPhotoCode));
                responseUtil.setResponseUtil(1, "新增用户详情成功",
                        userDetail,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil deleteUserDetail(UserDetail userDetail){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userDetailMapper.deleteByUserName(userDetail) >= 1){
                UserNameToPhotoCode userNameToPhotoCode  = new UserNameToPhotoCode();//删除NameToPhoto
                userNameToPhotoCode.setUsername(userDetail.getPhotomeUserdetailUsername());
                UserNameToMusicCode userNameToMusicCode = new UserNameToMusicCode();//删除NameToMsuic
                userNameToMusicCode.setUsername(userDetail.getPhotomeUserdetailUsername());
                if (userNameToPhotoCodeService.deleteByUTC(userNameToPhotoCode).getResultCode() == 1 &&
                        userNameToMusicCodeService.deleteByUTC(userNameToMusicCode).getResultCode() == 1){
                    responseUtil.setResponseUtil(1, "删除用户详情成功",
                            1,null);
                }
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil updateUserDetail(UserDetail userDetail){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userDetailMapper.updateByUserName(userDetail) >= 1){
                userDetail = userDetailMapper.selectDetailByUserName(userDetail);//取得更新后的userDetail
                responseUtil.setResponseUtil(1, "更新用户详情成功",
                        userDetail,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil getDetail(UserDetail userDetail){//获取photo模块的detail
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            userDetail = userDetailMapper.selectDetailByUserName(userDetail);//取得个人信息
            if (userDetail != null){
                responseUtil.setResponseUtil(1, "获取用户详情成功",
                        userDetail,getAllMusicPhotoComment(userDetail));
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

//    //获取登录界面的详情：userDetail、coverPhoto、backMsuic
//    public ResponseUtil getLoginDetail(UserDetail userDetail){
//        ResponseUtil responseUtil = new ResponseUtil();
//        try {
//            userDetail = userDetailMapper.selectDetailByUserName(userDetail);//取得个人信息
//            if (userDetail != null){
//                UserPhoto userPhoto = new UserPhoto();//取得封面Photo
//                userPhoto.setPhotomeUserphotoPhotocode(userDetail.getPhotomeUserdetailUsercovercode());
//                UserMusic userMusic = new UserMusic();//取得主题Music
//                userMusic.setPhotomeUsermusicMusiccode(userDetail.getPhotomeUserdetailUsermusiccode());
//                HashMap<String,Object> hashMap = new HashMap<>();
//                hashMap.put("coverPhoto",userPhotoMapper.selectPhotoByPhotoCode(userPhoto));
//                hashMap.put("backMusic",userMusicMapper.selectByMusicCode(userMusic));
//                responseUtil.setResponseUtil(1, "获取用户详情成功",
//                        userDetail,hashMap);
//            }
//        }catch (Exception e){
//            responseUtil.setResultMsg(e.getMessage());
//        }
//        return responseUtil;
//    }
    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    public ResponseUtil getAllUserDetail(int pageNum, int pageSize) {
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            //将参数传给这个方法就可以实现物理分页了，非常简单。
            PageHelper.startPage(pageNum, pageSize);
            List<UserDetail> userDetailList = userDetailMapper.selectALLDetail();
            PageInfo result = new PageInfo(userDetailList);
            responseUtil.setResponseUtil(1, "获取all用户详情成功",
                    result,null);
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

//    获取单个用户的所有photo、music、comment
    public Object getAllMusicPhotoComment(UserDetail userDetail){
        HashMap<String,Object> hashMap = new HashMap<>();
        ArrayList<UserMusic> userMusicArrayList = new ArrayList<UserMusic>();
        //取得Music
        UserNameToMusicCode userNameToMusicCode = new UserNameToMusicCode();
        userNameToMusicCode.setUsername(userDetail.getPhotomeUserdetailUsername());
        List<UserNameToMusicCode> userNameToMusicCodeList = userNameToMusicCodeMapper.selectByUTC(userNameToMusicCode);
        UserMusic userMusic = new UserMusic();
        for (int i=0;i<userNameToMusicCodeList.size();i++){
            userMusic.setPhotomeUsermusicMusiccode(userNameToMusicCodeList.get(i).getMusiccode());
            userMusicArrayList.add(userMusicMapper.selectByMusicCode(userMusic));
        }
        //取得Photo
        UserNameToPhotoCode userNameToPhotoCode = new UserNameToPhotoCode();
        userNameToPhotoCode.setUsername(userDetail.getPhotomeUserdetailUsername());
        List<UserNameToPhotoCode> userNameToPhotoCodeList = userNameToPhotoCodeMapper.selectByUTC(userNameToPhotoCode);
        //取得封面Photo
        UserPhoto userPhoto = new UserPhoto();
        userPhoto.setPhotomeUserphotoPhotocode(userDetail.getPhotomeUserdetailUsercovercode());
        userPhoto = userPhotoMapper.selectPhotoByPhotoCode(userPhoto);

        //取得评论
        UserComment userComment = new UserComment();
        userComment.setPhotomeUsercommentCommenteduser(userDetail.getPhotomeUserdetailUsername());
        List<UserComment> userCommentList = userCommentMapper.selectCommentByUserName(userComment);
        hashMap.put("userMusic",userMusicArrayList);
        hashMap.put("userPhoto",userNameToPhotoCodeList);
        hashMap.put("userComment",userCommentList);
        hashMap.put("coverPhoto",userPhoto);
        return hashMap;
    }
}