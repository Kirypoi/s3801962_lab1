import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class SomeMethodsTest {


    SomeMethods toTest;

    @org.junit.jupiter.api.Test
    void weight_index() {
        /// Given
        float w = 5f;
        float h = 6f;
        // When
        float result = toTest.weight_index(w, h);
        float index_val;
        index_val = h*h;
        index_val = w / index_val;
        // Then
        assertEquals(index_val, result);
    }

    @org.junit.jupiter.api.Test
    void get_weight() {
        // Given
    }

    @org.junit.jupiter.api.Test
    void get_height() {
    }
}