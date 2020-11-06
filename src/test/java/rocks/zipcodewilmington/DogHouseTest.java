package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addByDogTest(){
        //given
        Dog dogToBeAdded = new Dog(null, null, 0);
        DogHouse.add(dogToBeAdded);

        //when
        Integer id = 0;
        Dog retrievedDog = DogHouse.getDogById(id);

        // then
        Assert.assertTrue(retrievedDog instanceof Dog);
        DogHouse.remove(dogToBeAdded);
    }


    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeByIdTest() {
        // given
        Dog dogToBeAdded = new Dog(null, null, 0);
        DogHouse.add(dogToBeAdded);
        Integer id = dogToBeAdded.getId();

        // when
        DogHouse.remove(id);
        Dog retrievedDog = DogHouse.getDogById(id);

        // then
        Assert.assertNull(retrievedDog);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeByDogTest() {
        // given
        Dog dogToBeAdded = new Dog(null, null, 0);
        DogHouse.add(dogToBeAdded);

        // when
        DogHouse.remove(dogToBeAdded);
        Integer id = dogToBeAdded.getId();
        Dog retrievedDog = DogHouse.getDogById(id);

        // then
        Assert.assertNull(retrievedDog);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {
        // given
        Dog DogToBeAdded = new Dog(null, null, 0);
        DogHouse.add(DogToBeAdded);
        Integer Expected = DogToBeAdded.getId();

        // when
        Integer id = 0;
        Dog retrievedDog = DogHouse.getDogById(id);
        Integer Actual = retrievedDog.getId();

        // then
        Assert.assertEquals(Expected,Actual);
        DogHouse.remove(DogToBeAdded);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void GetNumberOfDogsTest() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
