package myprojects.angriff.service.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ProjectBean {
	private Long projectId;
	@NotBlank(message="Bitte geben Sie einen Projektnamen ein")
	@Size(min=3, max=50, message="Projektname soll mindestens 3 und nicht mehr als 50 Zeichen enthalten")
	@Pattern(regexp="^[a-zA-Z0-9]+$", message="Projektname darf nur Nummern und Buchstaben beinhalten")
	private String projectName;
	@NotBlank(message="Bitte wählen Sie ein Release Datum aus")
	private String releaseDate;
	@Size(min=1, max=250, message="Die Beschreibung muss mindestens drei Zeichen und kann höchstens 250 enthalten!")
	private String description;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
