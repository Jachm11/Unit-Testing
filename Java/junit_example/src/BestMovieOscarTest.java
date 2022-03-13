import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;


import org.junit.Test;

public class BestMovieOscarTest {

    @Test
    public void testYear2010(){

        var a2010 = new BestMovieOscar(2010);

        assertEquals("The King's Speech", a2010.getName());
        assertEquals(2010, a2010.getYear());
        assertEquals("Tom Hooper", a2010.getDirector());
        assertEquals("Historical drama", a2010.getGenre());

    }

    @Test
    public void testYear2020(){

        var a2020 = new BestMovieOscar(2020);

        assertEquals("Nomadland", a2020.getName());
        assertEquals(2020, a2020.getYear());
        assertEquals("Chloé Zhao", a2020.getDirector());
        assertEquals("Drama", a2020.getGenre());
        
    }

    @Test
    public void testYear2009(){

        assertThrows(IllegalArgumentException.class, () -> {
            var a2009 = new BestMovieOscar(2009);
        });
    }

    @Test
    public void testYear2021(){

        assertThrows(IllegalArgumentException.class, () -> {
            var a2021 = new BestMovieOscar(2021);
        });
    }


    @Test
    public void testInfoArr2015(){

        var a2015 = new BestMovieOscar(2015);

        Object[] arr = new Object[4];

        arr[0] = 2015;
        arr[1] = "Spotlight";
        arr[2] = "Tom McCarthy";
        arr[3] = "Drama";

        assertArrayEquals(arr, a2015.getInfo());

    }

    @Test
    public void testIArrLenght(){


        var a2010 = new BestMovieOscar(2010);
        var a2011 = new BestMovieOscar(2011);
        var a2012 = new BestMovieOscar(2012);
        var a2013 = new BestMovieOscar(2013);
        var a2014 = new BestMovieOscar(2014);
        var a2015 = new BestMovieOscar(2015);
        var a2016 = new BestMovieOscar(2016);
        var a2017 = new BestMovieOscar(2017);
        var a2018 = new BestMovieOscar(2018);
        var a2019 = new BestMovieOscar(2019);
        var a2020 = new BestMovieOscar(2020);

        assertEquals(4, a2010.getInfo().length);
        assertEquals(4, a2011.getInfo().length);
        assertEquals(4, a2012.getInfo().length);
        assertEquals(4, a2013.getInfo().length);
        assertEquals(4, a2014.getInfo().length);
        assertEquals(4, a2015.getInfo().length);
        assertEquals(4, a2016.getInfo().length);
        assertEquals(4, a2017.getInfo().length);
        assertEquals(4, a2018.getInfo().length);
        assertEquals(4, a2019.getInfo().length);
        assertEquals(4, a2020.getInfo().length);

    }

    @Test
    public void testNot2014(){

        var a2019 = new BestMovieOscar(2019);

        assertNotEquals("The Shape of Water", a2019.getName());

    }

}
