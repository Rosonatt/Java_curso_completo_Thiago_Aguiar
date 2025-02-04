// Member.java
package com.gymmanager.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Member {
    private String id;
    private String name;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private LocalDate joinDate;
    private MembershipStatus status;
    private List<Workout> workouts;
    private List<Payment> payments;
    private MembershipPlan membershipPlan;

    public Member() {
        this.id = UUID.randomUUID().toString();
        this.workouts = new ArrayList<>();
        this.payments = new ArrayList<>();
        this.joinDate = LocalDate.now();
    }

    public Member(String name, String email, String phone, LocalDate birthDate) {
        this();
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.status = MembershipStatus.ACTIVE;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public MembershipStatus getStatus() {
        return status;
    }

    public void setStatus(MembershipStatus status) {
        this.status = status;
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }

    public void addWorkout(Workout workout) {
        this.workouts.add(workout);
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void addPayment(Payment payment) {
        this.payments.add(payment);
    }

    public MembershipPlan getMembershipPlan() {
        return membershipPlan;
    }

    public void setMembershipPlan(MembershipPlan membershipPlan) {
        this.membershipPlan = membershipPlan;
    }
}
