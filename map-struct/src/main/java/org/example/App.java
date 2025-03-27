package org.example;


/**
 * map struct example
 */
public class App {
    public static void main(String[] args) {

        LoginDto loginDto = new LoginDto();

        loginDto.setUsername("abc@gmail.com");

        loginDto.setPassword("pass_122");

        LoginEntity loginEntity = LoginMapper.LOGIN_MAPPER.loginDtoToLoginEntity(loginDto);

        System.out.println("loginDtoToLoginEntity:\n" + loginEntity);
        LoginDto loginDto1 = LoginMapper.LOGIN_MAPPER.loginEntityToLoginDto(loginEntity);
        System.out.println("loginEntityToLoginDto:\n" + loginDto1);

//using java8 feature
        Converter<LoginEntity, LoginDto> converter;

        converter = (LoginDto loginDto5) -> LoginMapper.LOGIN_MAPPER.loginDtoToLoginEntity(loginDto5);


       // converter = LoginMapper.LOGIN_MAPPER::loginDtoToLoginEntity;
        LoginEntity loginEntity5 = converter.convert(loginDto);

        System.out.println("login entity 5............" + loginEntity5);

        Converter<LoginDto, LoginEntity> converter2 = (LoginEntity loginEntity6) -> LoginMapper.LOGIN_MAPPER.loginEntityToLoginDto(loginEntity6);

        LoginDto loginDto5 = converter2.convert(loginEntity5);

        System.out.println("loginDto 5......" + loginDto5);

    }
}
