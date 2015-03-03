package com.hazelcast.concurrent.atomiclong;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.test.HazelcastParallelClassRunner;
import com.hazelcast.test.annotation.QuickTest;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(HazelcastParallelClassRunner.class)
@Category(QuickTest.class)
public class AtomicLongBasicLocalTest extends BasicAtomicLongTest {

    @Override
    protected HazelcastInstance[] newInstances() {
        return createHazelcastInstanceFactory(1).newInstances();
    }
}