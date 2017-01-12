package net.vrallev.kapt3.bug;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class SomeAutoValueObject {

  public abstract int getUserId();
  public abstract String getPhotoUrl();
  public abstract String getContactName();
  public abstract long getLastSendDate();

  public static Builder builder() {
    return new AutoValue_SomeAutoValueObject.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setUserId(int newUserId);

    public abstract Builder setPhotoUrl(String newPhotoUrl);

    public abstract Builder setContactName(String newContactName);

    public abstract Builder setLastSendDate(long newLastSendDate);

    public abstract SomeAutoValueObject build();
  }
}
