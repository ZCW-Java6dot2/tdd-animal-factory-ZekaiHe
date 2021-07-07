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
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest() {
        // given
        Cat catToBeAdded = new Cat(null, null, 0);
        CatHouse.add(catToBeAdded);

        // when
        Integer id = 0;
        Cat retrievedCat = CatHouse.getCatById(id);

        // then
        Assert.assertTrue(retrievedCat instanceof Cat);
        CatHouse.remove(catToBeAdded);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIdTest() {
        // given
        Cat catToBeAdded = new Cat(null, null, 0);
        CatHouse.add(catToBeAdded);
        Integer id = catToBeAdded.getId();

        // when
        CatHouse.remove(id);
        Cat retrievedCat = CatHouse.getCatById(id);

        // then
        Assert.assertNull(retrievedCat);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeByCatTest() {
        // given
        Cat catToBeAdded = new Cat(null, null, 0);
        CatHouse.add(catToBeAdded);

        // when
        CatHouse.remove(catToBeAdded);
        Integer id = catToBeAdded.getId();
        Cat retrievedCat = CatHouse.getCatById(id);

        // then
        Assert.assertNull(retrievedCat);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        // given
        Cat catToBeAdded = new Cat(null, null, 0);
        CatHouse.add(catToBeAdded);
        Integer Expected = catToBeAdded.getId();

        // when
        Integer id = 0;
        Cat retrievedCat = CatHouse.getCatById(id);
        Integer Actual = retrievedCat.getId();

        // then
        Assert.assertEquals(Expected,Actual);
        CatHouse.remove(catToBeAdded);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void GetNumberOfDogsTest() {
        // Given (some
        String name = "Luna";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }
}
