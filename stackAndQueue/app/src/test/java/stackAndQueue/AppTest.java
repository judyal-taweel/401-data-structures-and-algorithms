/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stackAndQueue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    public void testPushStack(){
        Stack testStackList = new Stack();
        testStackList.push(1);
        assertNotNull(testStackList);
    }
    @Test
    public void testPeekStack(){
        Stack testStackList = new Stack();
        testStackList.push(1);
        testStackList.push(2);
        testStackList.push(3);
        assertEquals(3 , testStackList.peek());
    }
    @Test
    public void testEnqueueQueue(){
        Queue testQueueList = new Queue();
        testQueueList.enQueue(1);
        assertNotNull(testQueueList);
    }
    @Test
    public void testPeekQueue(){
        Queue testQueueList = new Queue();
        testQueueList.enQueue(1);
        testQueueList.enQueue(2);
        testQueueList.enQueue(3);
        assertEquals(1 , testQueueList.peek());
    }
}
