 @Test
    void intentionalPipelineFailureTest() {
        // This will deliberately fail because 1 is not equal to 2
        org.junit.jupiter.api.Assertions.assertEquals(1, 2, "Deliberate pipeline failure execution trace.");
    }
