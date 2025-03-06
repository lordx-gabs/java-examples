package sobrescrita;

public class SobrescritaTest {

    public static class Pessoa {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
