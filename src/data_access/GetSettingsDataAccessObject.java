package data_access;

import use_case.get_weather.GetSettingsDataAccessInterface;

public class GetSettingsDataAccessObject implements GetSettingsDataAccessInterface {
    @Override
    public Boolean getIfCelcius() {
        return null;
    }

    @Override
    public String getPreferredCity() {
        return null;
    }
}
