package com.yu.pattern.builder.demo2;

public class Computer2 {
    private String cpu;
    private String memory;
    private String gpu;

    public Computer2(Builder builder) {
        cpu = builder.getCpu();
        memory = builder.getMemory();
        gpu= builder.getGpu();
    }

    @Override
    public String toString() {
        return "Computer2{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }

    public static class Builder {


        private String cpu;
        private String memory;
        private String gpu;

        public String getCpu() {
            return cpu;
        }

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public String getMemory() {
            return memory;
        }

        public Builder setMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public String getGpu() {
            return gpu;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }
        public Computer2 builder() {
            return new Computer2(this);
        }

    }

}
