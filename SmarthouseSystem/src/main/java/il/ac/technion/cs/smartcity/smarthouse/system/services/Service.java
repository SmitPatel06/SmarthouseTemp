package il.ac.technion.cs.smartcity.smarthouse.system.services;

import il.ac.technion.cs.smartcity.smarthouse.system.SystemCore;

public abstract class Service {

    protected SystemCore systemCore;
    
    public Service(final SystemCore $) {
        systemCore = $;
    }
}
