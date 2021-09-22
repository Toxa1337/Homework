package task2;

public class Shape {
        private String form;
        private String color;

        public Shape (String t, String c){
            form= t;
            color = c;
        }
        public Shape (String t){
        form= t;
        color = "Green";
        }
        public Shape (){
        form= "Circle";
        color = "Red";
        }
        public void setForm(String form) {
            this.form = form;
        }
        public void setColor(String color) {
            this.color = color;
        }

        public String getForm(){
            return form;
        }
        public String getColor() {
            return color;
        }

        public String toString(){ return (this.form+" is "+this.color); }
    }
