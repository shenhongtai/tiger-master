package cn.imtiger.master.access.service.impl;

import cn.imtiger.master.access.entity.PasswordLog;
import cn.imtiger.master.access.dao.PasswordLogDao;
import cn.imtiger.master.access.service.PasswordLogService;
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
