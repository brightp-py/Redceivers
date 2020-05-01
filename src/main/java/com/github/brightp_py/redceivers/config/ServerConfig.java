package com.github.brightp_py.redceivers.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ServerConfig {

    ServerConfig(final ForgeConfigSpec.Builder builder) {
        builder.push("general");
        builder.pop();
    }
}
