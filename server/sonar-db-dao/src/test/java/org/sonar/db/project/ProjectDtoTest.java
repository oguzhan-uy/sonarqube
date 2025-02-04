package org.sonar.db.project;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ProjectDtoTest {

    @Test
    void shouldCalculateDescriptionLengthWhenSet() {
        ProjectDto project = new ProjectDto()
                .setKey("my-project")
                .setName("Test Project")
                .setDescription("This is a test project.");

        assertThat(project.getDescriptionLength())
                .as("Description length should match the actual number of characters")
                .isEqualTo(23);
    }

    @Test
    void shouldSetDescriptionLengthToZeroWhenDescriptionIsNull() {
        ProjectDto project = new ProjectDto()
                .setKey("my-project")
                .setName("Test Project")
                .setDescription(null);

        assertThat(project.getDescriptionLength())
                .as("Description length should be zero when description is null")
                .isEqualTo(0);
    }

    @Test
    void shouldUpdateDescriptionLengthWhenDescriptionChanges() {
        ProjectDto project = new ProjectDto()
                .setDescription("Short description.");

        assertThat(project.getDescriptionLength())
                .as("Initial description length should be correct")
                .isEqualTo(18);

        project.setDescription("This is a longer updated description!");
        assertThat(project.getDescriptionLength())
                .as("Description length should update correctly when description changes")
                .isEqualTo(37);
    }

    @Test
    void shouldHandleEmptyDescription() {
        ProjectDto project = new ProjectDto()
                .setDescription("");

        assertThat(project.getDescriptionLength())
                .as("Description length should be zero for an empty description")
                .isEqualTo(0);
    }
}
