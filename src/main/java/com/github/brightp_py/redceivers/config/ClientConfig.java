package com.github.brightp_py.redceivers.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.List;

public class ClientConfig {

    ClientConfig(final ForgeConfigSpec.Builder builder) {
        builder.push("general");
        builder.pop();
    }
}
