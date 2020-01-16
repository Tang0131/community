package life.majiang.community.controller;


import life.majiang.community.dto.AccessTokenDTO;
import life.majiang.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {
    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String State) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id("d006de14573c93663c45");
        accessTokenDTO.setRedirect_url("http://localhost:8887/callback");
        accessTokenDTO.setCode(code);
        accessTokenDTO.setClient_secret("3a745239da9ae3b0c4079006729e4cd05aef6d96");
        accessTokenDTO.setState(State);
        githubProvider.getAccessToken(accessTokenDTO);
        return "index";
    }




}
