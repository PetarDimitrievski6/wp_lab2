package mk.finki.ukim.mk.lab2.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mk.finki.ukim.mk.lab2.service.ArtistService;
import mk.finki.ukim.mk.lab2.service.SongService;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.web.IWebExchange;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

import java.io.IOException;

@WebServlet(name = "artist-servlet", urlPatterns = "/artist")
public class ArtistServlet extends HttpServlet {
    private final SpringTemplateEngine springTemplateEngine;
    private final ArtistService artistService;
    private final SongService songService;

    public ArtistServlet(SpringTemplateEngine springTemplateEngine, ArtistService artistService, SongService songService) {
        this.springTemplateEngine = springTemplateEngine;
        this.artistService = artistService;
        this.songService = songService;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IWebExchange webExchange = JakartaServletWebApplication.buildApplication(getServletContext()).buildExchange(req, resp);
        WebContext context = new WebContext(webExchange);
        context.setVariable("song", this.songService.findByTrackId(req.getParameter("songChoice")));
        context.setVariable("artists", this.artistService.listArtists());
        this.springTemplateEngine.process("artistsList.html", context, resp.getWriter());
    }
}
