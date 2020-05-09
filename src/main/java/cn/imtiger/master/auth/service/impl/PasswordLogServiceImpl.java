package cn.imtiger.master.auth.service.impl;

import cn.imtiger.master.auth.dao.PasswordLogDao;
import cn.imtiger.master.auth.entity.PasswordLog;
import cn.imtiger.master.auth.service.PasswordLogService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户密码修改记录 服务实现类
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@Service
public class PasswordLogServiceImpl extends ServiceImpl<PasswordLogDao, PasswordLog> implements PasswordLogService {

}
