package guru.springframework.sfgdi.services;


public class DogPetService implements PetService{
    @Override
    public String getPetType() {
        return "Hello World - Dog";
    }
}
