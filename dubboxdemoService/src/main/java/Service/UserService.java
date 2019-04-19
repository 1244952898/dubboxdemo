package Service;

import com.alibaba.dubbo.config.annotation.Service;
@Service
public class UserService implements IUserService {
    @Override
    public String GetName() {
        return "aaa";
    }
}
