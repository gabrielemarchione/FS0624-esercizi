package gabrielemarchione.services;

import gabrielemarchione.entities.Dipendente;
import gabrielemarchione.exceptions.UnauthorizedException;
import gabrielemarchione.payloads.UserLoginDTO;
import gabrielemarchione.tools.JWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AuthService {
    @Autowired
    private DipendenteService dipendenteService;

    @Autowired
    private JWT jwt;

    public String checkCredentialsAndGenerateToken(UserLoginDTO payload) {
        Dipendente dipendente = this.dipendenteService.findById(UUID.fromString(payload.id()));
        if (dipendente.getPassword().equals(payload.password())) {
            String accessToken = jwt.createToken(dipendente);
            return accessToken;
        } else {
            throw new UnauthorizedException("Credenziali errate!");
        }
    }

}