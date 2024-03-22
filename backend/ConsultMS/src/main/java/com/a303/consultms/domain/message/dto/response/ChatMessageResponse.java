package com.a303.consultms.domain.message.dto.response;

import java.io.Serializable;
import lombok.Builder;

@Builder
public record ChatMessageResponse(
    String channelId,
    String sender,
    int memberId,
    String content
) implements Serializable {

}
