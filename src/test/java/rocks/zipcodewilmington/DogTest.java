package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    private Dog dog;

    @Before
    public void setup() {
        this.dog = new Dog(null, null, null);
    }


    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthDate() {
        // Given (a name exists and a dog exists)
        Date birthDate = new Date();
        // When (a dog's name is set to the given name)
        dog.setBirthDate(birthDate);

        // Then (we expect to get the given name from the dog)
        Date dogBirthDate = dog.getBirthDate();
        Assert.assertEquals(dogBirthDate, birthDate);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        // Given
        String expected = "bark!";

        // when
        String actual = dog.speak();

        // then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        // given
        Date expected = new Date();

        // when
        dog.setBirthDate(expected);

        // then
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        // given
        Food food = new Food();
        int initialMealsEaten = dog.getNumberOfMealsEaten();
        int expected = initialMealsEaten + 1;


        // when
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();

        // then
        Assert.assertEquals(expected, actual);
    }

    //TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        // given
        Food food = new Food();
        int initialMealsEaten = dog.getNumberOfMealsEaten();
        int expected = initialMealsEaten + 1;


        // when
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();

        // then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void implementTest() {
        // given
        Dog dog = new Dog(null, null, null);

        // when
        boolean outcome = dog instanceof Animal;

        // then
        Assert.assertTrue(outcome);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceTest() {
        // given
        Dog dog = new Dog(null, null, null);

        // when
        boolean outcome = dog instanceof Mammal;

        // then
        Assert.assertTrue(outcome);
    }
}
