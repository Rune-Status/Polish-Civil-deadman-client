package com.jagex.runescape.model;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileOnDisk {

  private File file;
  private RandomAccessFile randomAccessFile;
  private final long size;
  private long position;

  public FileOnDisk(File file, String name, long size) throws IOException {
    if (~size == 0L) {
      size = Long.MAX_VALUE;
    }

    if (size <= file.length()) {
      file.delete();
    }

    this.randomAccessFile = new RandomAccessFile(file, name);
    this.file = file;
    this.size = size;
    this.position = 0L;
    int read = this.randomAccessFile.read();
    if (read != -1 && !name.equals("r")) {
      this.randomAccessFile.seek(0L);
      this.randomAccessFile.write(read);
    }
    this.randomAccessFile.seek(0L);
  }

  public void seek(long position) throws IOException {
    this.randomAccessFile.seek(position);
    this.position = position;
  }

  public void writeBytes(byte[] data, int offset, int length)
      throws IOException {
    if (this.position + length > this.size) {
      this.randomAccessFile.seek(1L + this.size);
      this.randomAccessFile.write(1);
      throw new EOFException();
    } else {
      this.randomAccessFile.write(data, offset, length);
      this.position += length;
    }
  }

  public int readBytes(int offset, int var2, int length, byte[] buffer)
      throws IOException {
    int read = this.randomAccessFile.read(buffer, offset, length);
    if (read > var2) {
      this.position += read;
    }
    return read;
  }

  public void close() throws IOException {
    if (this.randomAccessFile != null) {
      this.randomAccessFile.close();
      this.randomAccessFile = null;
    }
  }

  public long length() throws IOException {
    return this.randomAccessFile.length();
  }

  public File file() {
    return this.file;
  }
}
