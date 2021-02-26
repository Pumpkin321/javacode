import impl.MyService;
import impl.XUPT;

module MyOne {
    exports T1;
    exports T2;
    exports impl;
    provides MyService with XUPT;
}