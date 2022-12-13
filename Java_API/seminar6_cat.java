public class seminar6_cat {
        private String name;
        private String owner;
        private String breed;
        private float weight;
    
    
        public Cat(String name, String owner, String breed, float weight) {
            this.name = name;
            this.owner = owner;
            this.breed = breed;
            this.weight = weight;
        }
    
    
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    
        public String getOwner() {
            return owner;
        }
        public void setOwner(String owner) {
            this.owner = owner;
        }
    
        public String getBreed() {
            return breed;
        }
    
    
    
        public void meow () {
            System.out.println("Meow!");
        }
    
        
    
        @Override
        public String toString() {
            return "Cat [name=" + name + ", owner=" + owner + ", breed=" + breed + ", weight=" + weight + "]";
        }
    }    

