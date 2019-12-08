package com.test.vaadinTest;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Label;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

@AllArgsConstructor
@Getter
public class Display extends Dialog {

    private final Label label;

    private final List<Checkbox> checkboxes;

    private final List<Button> buttons;



    static class DisplayBuilder {

        private Label label;

        private List<Checkbox> checkboxes;

        private List<Button> answers;


        private DisplayBuilder() {
            answers = new LinkedList<>();
            checkboxes = new LinkedList<>();
        }


        public DisplayBuilder content(String content) {
            Label label = new Label();
            label.setText(content);
            this.label = label;
            return this;
        }

        public DisplayBuilder checkbox(String checboxName) {
            Checkbox checkbox = new Checkbox();
            checkbox.setLabel(checboxName);
            this.checkboxes.add(checkbox);
            return this;
        }


        public DisplayBuilder addButton(String buttonName) {
            Button button = new Button();
            button.setText(buttonName);
            this.answers.add(button);
            return this;
        }

        public Display build() {
            return new Display(label, checkboxes, answers);
        }
    }

    public static DisplayBuilder builder() {
        return new DisplayBuilder();
    }


}
