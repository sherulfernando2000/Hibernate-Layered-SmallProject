/*
 * Copyright  2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package lk.ijse.entity;

import jakarta.persistence.*;

@Entity
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  // primarykey

    @ManyToOne
    @JoinColumn(name = "oId")
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "iId")
    private Item item;

    private double qtySold;

    public OrderDetails() {
    }

    public OrderDetails(Orders order, Item item, double qtySold) {
        this.order = order;
        this.item = item;
        this.qtySold = qtySold;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getQtySold() {
        return qtySold;
    }

    public void setQtySold(double qtySold) {
        this.qtySold = qtySold;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "order=" + order +
                ", item=" + item +
                ", qtySold=" + qtySold +
                '}';
    }
}
