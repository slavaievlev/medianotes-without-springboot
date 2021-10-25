package medianotes.controller;

import medianotes.dto.CreateNoteDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    @GetMapping
    public List<String> getAllNotes() {
        return List.of(
                "1",
                "2",
                "3"
        );
    }

    @PostMapping
    public String createNote(@RequestBody CreateNoteDto createNoteDto) {
        return createNoteDto.getTitle() + " created!";
    }
}
