/**
 * PersonServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.org;

public interface PersonServiceImpl extends java.rmi.Remote {
    public boolean addPerson(com.org.Person p) throws java.rmi.RemoteException;
    public boolean deletePerson(int id) throws java.rmi.RemoteException;
    public com.org.Person[] getAllPersons() throws java.rmi.RemoteException;
    public com.org.Person getPerson(int id) throws java.rmi.RemoteException;
}
