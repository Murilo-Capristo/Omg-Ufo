package br.com.fiap.omg_ufo.sigh;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SighService {

    private final SighRepository sighRepository;

    public SighService(SighRepository sighRepository){
        this.sighRepository = sighRepository;
    }

    public List<Sigh> getAllSighs(){
        return sighRepository.findAll();
    }

    public Sigh save(Sigh sigh){
        return sighRepository.save(sigh);
    }
}

