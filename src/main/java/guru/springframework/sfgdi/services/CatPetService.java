package guru.springframework.sfgdi.services;


public class CatPetService implements PetService{
    @Override
    public String getPetType() {
        return "Hello World - Cat";
    }
}
