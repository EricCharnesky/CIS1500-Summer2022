import static org.junit.jupiter.api.Assertions.*;

class GeocacheTest {

    @org.junit.jupiter.api.Test
    void constructor() {
        // Arrange
        String expectedLatitude = "123";
        String expectedLongitude = "234";
        String expectedItem = "shiny rock";
        String expectedHint = "look at the ground";
        int expectedLikeCount = 0;

        // Act
        Geocache geocache = new Geocache(expectedLatitude, expectedLongitude, expectedItem, expectedHint);
        String actualLatitude = geocache.getLatitude();
        String actualLongitude = geocache.getLongitude();
        String actualItem = geocache.getItem();
        String actualHint = geocache.getHint();
        int actualLikeCount = geocache.getLikeCount();

        assertEquals(expectedLatitude, actualLatitude);
        assertEquals(expectedLongitude, actualLongitude);
        assertEquals(expectedItem, actualItem);
        assertEquals(expectedHint, actualHint);
        assertEquals(expectedLikeCount, actualLikeCount);
    }

    @org.junit.jupiter.api.Test
    void like() {
        // AAA

        // Arrange
        int expectedLikeCount = 1;
        Geocache geocache = new Geocache("", "", "", "" );

        // Act
        geocache.like();
        int actualLikeCount = geocache.getLikeCount();

        // Assert
        assertEquals(expectedLikeCount, actualLikeCount);
    }

    @org.junit.jupiter.api.Test
    void setItem() {
        // Arrange
        String expectedItem = "shiny rock";
        Geocache geocache = new Geocache("", "", "", "" );

        // Act
        geocache.setItem(expectedItem);
        String actualItem = geocache.getItem();

        // Assert
        assertEquals(expectedItem, actualItem);
    }
}