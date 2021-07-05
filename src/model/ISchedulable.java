// Importaciones necesarias.
package model;

import java.util.Date;

// Creamos la interface ISchedulable y su método schedule().
public interface ISchedulable {
    void schedule(Date date, String time);
}
