package cn.ybetter.data.entity;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * (Hero)实体类
 *
 * @author yb
 * @since 2020-07-22 11:37:38
 */
@Table(name = "hero")
public class Hero implements Serializable {
    private static final long serialVersionUID = -60581052396384986L;
    
    private Integer id;
    
    private String name;
    
    private Float hp;
    
    private Integer damage;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getHp() {
        return hp;
    }

    public void setHp(Float hp) {
        this.hp = hp;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

}