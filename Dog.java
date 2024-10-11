public abstract class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract String speak();

        public abstract int avgBreedWeight();
    }


