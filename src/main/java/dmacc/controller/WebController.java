/**
 * @author Dylan Thomas - djthomas4
 * CIS175 - Fall 2021
 * Nov 3, 2021
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Song;
import dmacc.repository.SongRepository;

@Controller
public class WebController {
	@Autowired
	SongRepository repo;

	@GetMapping("/viewAll")
	public String viewAllSongs(Model model) {
		model.addAttribute("songs", repo.findAll());
		return "results";
	}

	@GetMapping("/inputSong")
	public String addNewSong(Model model) {
		Song s = new Song();
		model.addAttribute("newSong", s);
		return "input";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteSong(@PathVariable("id") long id, Model model) {
		Song s = repo.findById(id).orElse(null);
	    repo.delete(s);
	    return viewAllSongs(model);
	}
	
	@PostMapping("/inputSong")
	public String addNewSong(@ModelAttribute Song s, Model model) {
		repo.save(s);
		return viewAllSongs(model);
	}

	@GetMapping("/edit/{id}")
	public String showUpdateSong(@PathVariable("id") long id, Model model) {
		Song s = repo.findById(id).orElse(null);
		model.addAttribute("newSong", s);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseSong(Song s, Model model) {
		repo.save(s);
		return viewAllSongs(model);
	}

}
