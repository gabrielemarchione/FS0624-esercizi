package gabrielemarchione.controllers;

import gabrielemarchione.entities.Dipendente;
import gabrielemarchione.payloads.DipendenteDTO;
import gabrielemarchione.payloads.UserLoginDTO;
import gabrielemarchione.payloads.UserLoginResponseDTO;
import gabrielemarchione.services.AuthService;
import gabrielemarchione.services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;
    @Autowired
    private DipendenteService dipendenteService;

    @PostMapping("/login")
    public UserLoginResponseDTO login(@RequestBody UserLoginDTO body) {
        return new UserLoginResponseDTO(this.authService.checkCredentialsAndGenerateToken(body));
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public Dipendente postDipendente(@RequestBody DipendenteDTO dipendente) {
        return this.dipendenteService.saveDipendente(dipendente);
    }
}
