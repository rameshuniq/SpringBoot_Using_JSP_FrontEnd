
package com.app;

import org.springframework.data.repository.CrudRepository;

public interface IUser extends CrudRepository<User, Long> {

}
