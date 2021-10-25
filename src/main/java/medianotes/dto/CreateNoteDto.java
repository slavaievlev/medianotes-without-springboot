package medianotes.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateNoteDto {

    private final String title;

    private final String text;

    public CreateNoteDto(@JsonProperty("title") String title, @JsonProperty("text") String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
