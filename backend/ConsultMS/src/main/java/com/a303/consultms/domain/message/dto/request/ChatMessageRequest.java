package com.a303.consultms.domain.message.dto.request;

import java.io.Serializable;
import lombok.Builder;

@Builder
public record ChatMessageRequest(String from, String text) implements Serializable {

}
