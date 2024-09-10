package com.cantaruttim.fullstack.service;

import com.cantaruttim.fullstack.domain.User;
import com.cantaruttim.fullstack.dto.UserDTO;
import com.cantaruttim.fullstack.repository.UserRepository;
import com.cantaruttim.fullstack.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public User fromDTO(UserDTO objDto) {
        return new User(
                objDto.getId(),
                objDto.getNome(),
                objDto.getEmail(),
                objDto.getSenha(),
                objDto.getTelefone()
        );
    }

    public void delete(String id) {
        findById(id);
        repo.deleteById(id);
    }

    public User update(User obj) {
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setNome(obj.getNome());
        newObj.setEmail(obj.getEmail());
        newObj.setSenha(obj.getSenha());
        newObj.setTelefone(obj.getTelefone());
    }

}
