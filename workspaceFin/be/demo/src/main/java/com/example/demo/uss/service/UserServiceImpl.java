package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;
import com.example.demo.uss.repository.UserRepository;
import com.example.demo.uss.repository.UserRepositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl /* extends AbstractService<User> implements UserService */ {

    private final UserRepositoryImpl repo;

    // // 이것도 안쓰는 추세 @RequiredArgsConstructor이것을 사용 -> 다중쓰레드 컨텍스트 스위칭 발생 -> 상태 변경
    // 불가로
    // // 만들어 줌 멀티쓰레드 환경을 만ㄷ르겠따
    // // @Autowired
    // // public UserServiceImpl(UserRepositoryImpl repo){
    // // this.repo = repo;
    // // }

    // @Override
    // public Optional<User> findOne() {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public long count() {
    // // TODO Auto-generated method stub
    // return 0;
    // }

    // @Override
    // public void deleteById(long id) {
    // // TODO Auto-generated method stub

    // }

    // @Override
    // public boolean existsById(long id) {
    // // TODO Auto-generated method stub
    // return false;
    // }

    // @Override
    // public Optional<User> findById(long id) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public List<User> findAll() {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public List<User> findAllById(Iterable<Long> ids) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public User save(User entity) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public User getOne(long id) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // // UserDetailsService 의 메소드
    // @Override
    // public UserDetails loadUserByUsername(String username) throws
    // UsernameNotFoundException {

    // UserDto user = repo.findByUsername(username);
    // if (user == null) {
    // throw new UsernameNotFoundException(String.format("No user found with
    // username '%s'.", username));
    // } else {
    // return user;
    // }
    // }

    // @Override
    // public UserDto login(String username, String password) {
    // UserDto user = repo.login(username, password);
    // return null;
    // }
}
