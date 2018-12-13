package lambda.Demo1.service.impl;

import lambda.User;
import lambda.Demo1.service.UserFilterStrategy;

/**
 * @author lming.41032@gmail.com
 * @date 18-12-13 下午12:05
 */
public class AgeFilter implements UserFilterStrategy<User> {

    @Override
    public boolean filterUser(User user) {
        return user.getAge() > 30;
    }
}
