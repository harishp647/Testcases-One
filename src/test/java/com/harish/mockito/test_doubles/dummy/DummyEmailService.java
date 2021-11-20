package com.harish.mockito.test_doubles.dummy;

import com.harish.mockito.test_doubles.Dummy.EmailService;

public class DummyEmailService implements EmailService {
    @Override
    public void sendMessage(String message) {
     throw new AssertionError("Method not implemented");
    }
}
