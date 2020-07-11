package com.mentoria;

public final class ConnectionPool {

  private static ConnectionPool connection;

  private ConnectionPool() {

  }

  public static ConnectionPool getConnection(){
    if(connection == null)
      connection = new ConnectionPool();
    return connection;
  }

}
