package com.test.vaadinTest;

import java.util.List;

public class Goal {
    private String name;
    private String description;
    private List<String> levels;

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String name;
        private String description;
        private List<String> levels;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder levels(List<String> levels) {
            this.levels = levels;
            return this;
        }

        public Builder addLevel(String level) {
            this.levels.add(level);
            return this;
        }

        public Goal build() {
            if(name.isEmpty()){
                throw new IllegalStateException("Name cannot be empty");
            }
            if(levels.isEmpty()){
                throw new IllegalStateException("Levels cannot be empty");
            }

            Goal goal = new Goal();
            goal.name = this.name;
            goal.levels = this.levels;
            goal.description = this.description;
            return goal;
        }
    }
}
