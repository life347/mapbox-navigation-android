package com.mapbox.services.android.navigation.v5;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class NavigationEngineTest extends BaseTest {

  @Test
  public void sanityTest() {
    NavigationEngine navigationEngine = new NavigationEngine(new MapboxNavigationOptions(), true);
    assertNotNull("should not be null", navigationEngine);
  }
}